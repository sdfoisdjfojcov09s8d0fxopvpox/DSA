import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    long startTime = System.nanoTime();

    for (int i = 1; i < integerList.size(); i++) {
      int currentValue = integerList.get(i);

      int j = i - 1;
      while (j >= 0 && integerList.get(j) > currentValue) {
        integerList.set(j + 1, integerList.get(j));
        j--;
      }
      integerList.set(j + 1, currentValue);
    }

    System.out.println(System.nanoTime() - startTime);
    System.out.println();
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    long startTime = System.nanoTime();
    boolean swappedSomething = true;

    while (swappedSomething) {
      swappedSomething = false; 
      for (int i = 0; i < integerList.size() - 1; i ++) {
        if (integerList.get(i) > integerList.get(i + 1)) {
          swappedSomething = true;
          int temp = integerList.get(i);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, temp);
        }
      }
    }
    System.out.println(System.nanoTime() - startTime);
    System.out.println();
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}