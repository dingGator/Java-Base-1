package Quiz_1_26.Question19;

import java.io.FileNotFoundException;

/**
 * Created by Ki on 1/26/2017.
 */
public class StartCatch {
    public static void main(String[] args) {
        System.out.print("Start ");
        try {
            System.out.print("Hello world");
            throw new FileNotFoundException();
        } catch (FileNotFoundException e){
            System.out.println("Catch Here ");
     //   catch(FileNotFoundException e){
                System.out.print("File not found");
            }
        }

    }