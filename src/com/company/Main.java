package com.company;

public class Main {

    public static void main(String[] args) {
	String[] customers = {"Ville", "Marika", "Maija"};
	int[] rooms = {104, 119, 212};

	String name = "Marika";
	int room = 0;
	boolean found = false;
	for (int i = 0; i < customers.length; i++)
    {
        if (customers [i].equals(name))
        {
            found = true;
            room = rooms [1];
        }
    }
if (found)
    System.out.println("Room " + room);
else
    System.out.println("Not here");

    }
}
