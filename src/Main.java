public class Main
{
    public static void main(String[] args)
    {
        String party = "W";
        System.out.println("Enter your party [R,D,I]");

        if (party.equalsIgnoreCase("R")){
            System.out.println("You are a Republican Elephant");}

        else if (party.equalsIgnoreCase("D")){
            System.out.println("You are a Democratic Donkey");}

        else if (party.equalsIgnoreCase("I")){
            System.out.println("You are an Independent Man");}

        else
        {System.out.println("You are a part of a different party");}

    }
}