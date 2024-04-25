
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allRecipes = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        ArrayList<Recipe> splitRecipes = new ArrayList<>();
        List<String> ingr;

        //initial System output
        System.out.println("Files to read:");
        String fileName = String.valueOf(scanner.nextLine());

        
        //recording recipes
        try(Scanner reader = new Scanner(Paths.get(fileName))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                allRecipes.add(line);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        //Finding cooking times
        for(String i : allRecipes){
            if(isInteger(i)){
                time.add(allRecipes.indexOf(i));
            }
        }

        //split and group recipes

        for(int i = 0; i < time.size() - 1; i++){
            int recipeTime = Integer.valueOf(allRecipes.get(time.get(i)));
            String recipeName = allRecipes.get(time.get(i) - 1);
            List<String> ingredients = allRecipes.subList(time.get(i) + 1, time.get(i+1)-1);
                splitRecipes.add(new Recipe(recipeName,recipeTime,ingredients));
        } 

        //Last recipe in file (for loop can't reach it)
        int j = time.size() - 1;
        int recipeTime = Integer.valueOf(allRecipes.get(time.get(j)));
        String recipeName = allRecipes.get(time.get(j) - 1);
        List<String> ingredients = allRecipes.subList(time.get(j) + 1, allRecipes.size());
        splitRecipes.add(new Recipe(recipeName, recipeTime, ingredients));

        //User commmands
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient -  searches recipes by ingredient");

        while(true){
            System.out.println("");
            System.out.println("Enter command:");
            String command = String.valueOf(scanner.nextLine());
            if(command.equals("stop")){
                break;
            }else if(command.equals("list")){
                for(Recipe r : splitRecipes){
                    System.out.println(r);
                }
                System.out.println("");
            }else if (command.equals("find name")){
                System.out.println("Searched word:");
                String wordSearched = String.valueOf(scanner.nextLine());
                for(Recipe r : splitRecipes){
                    if(r.getName().contains(wordSearched)){
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }else if (command.contains("find cooking time")){
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipe r : splitRecipes){
                    if(maxTime >= r.getTime()){
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }else if(command.contains("find ingredient")){
                System.out.println("Ingredient:");
                String ingredientName = String.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipe r : splitRecipes){
                    if(r.getIngr().contains(ingredientName)){
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }

    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
