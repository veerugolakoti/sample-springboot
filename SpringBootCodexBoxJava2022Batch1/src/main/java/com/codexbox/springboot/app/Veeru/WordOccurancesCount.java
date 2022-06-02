

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordOccurancesCount {
	public static void main(String[] args) {
		System.out.println("This program will count the words from the input file path specified through command line arguments");

		if (args.length == 0) {
			System.err.println("No input file path given, Please provide input file path through command line arguments");
			return;
		}

		String filePath = args[0];
		File file = new File(filePath);
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Specifed file not found in location : " + filePath);
			e.printStackTrace();
		}

		String line = null;
		String[] words = null;
		
		while (true) {
			try {
				if (!((line = br.readLine()) != null)) break;
			} catch (IOException e) {
				System.out.println("Got IOException while reading the content from file" + filePath);
				e.printStackTrace();
			}
			words = line.split(" ");
			findWordCount(words);
		}
	}

	private static void findWordCount(String[] words) {
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		
		sortWordCountMap(wordCountMap);

	}

	private static void sortWordCountMap(Map<String, Integer> wordCountMap) {
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(wordCountMap.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		for (Map.Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
