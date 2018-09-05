package assignment2;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Juliette Levien
 */
public class check 
  {

    private int parkID;
    private String zone;
    private int takenPark;

    public check()
        {
        parkID = 0;
        zone = "";
        takenPark = 0;
        }   
    
    HashMap <Integer, String> parkingHM = new HashMap<Integer, String>(); 
    HashMap<Integer, String> parkTaken = new HashMap<Integer, String>();
    HashMap<Integer, String> freePark = new HashMap<Integer, String>();
    HashMap<Integer, String> parkSearch = new HashMap<Integer, String>();

    
    
    public void checkPark ( int parkingID, String zone )
    {
        parkingHM.put(parkingID, zone);
    }
    public void assignment2 ( int takenPark, String zone )
    {
    	parkTaken.put(takenPark, zone);
    }

    public void search (int searchPark, String zone)
    {
    	parkSearch.put(searchPark, zone);
    }
 }
