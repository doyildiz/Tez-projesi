package com.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;



import com.opencsv.CSVReader;



public class CSVclass {
	
	String[] baslýk;
	
	ArrayList<Gen> genListTest;

	public String[] baslýkgonder() throws IOException{
		String csvFilename = "C:\\tez_proje\\son8.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename),'	');
		String[] row = null;
		int a=0;
		
		while((row = csvReader.readNext()) != null) {
			
			if(a==0)
			{
				 baslýk=row;
			}
			csvReader.close();
		}
		return baslýk;
	}
	
	
	public ArrayList<Gen> verigonder(ArrayList<String> genList) throws IOException 
	{
		
		String csvFilename = "C:\\tez_proje\\son8.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename),'	');
		String[] row = null;
		genListTest = new ArrayList<Gen>();
		
		
		int a=0;
		int x =0;
		
		
		while((row = csvReader.readNext()) != null) {
			
			for(String gen : genList)
			{
				if(row[2].equals(gen))
				{
					Gen genTest = new Gen();
					genTest.setTax_id(row[0]);
					genTest.setGene_id(row[1]);
					genTest.setSymbol(row[2]);
					genTest.setLocusTag(row[3]);
					genTest.setSynonyms(row[4]);
					genTest.setDbXrefs(row[5]);
					genTest.setChromosome(row[6]);
					genTest.setMap_location(row[7]);
					genTest.setDescription(row[8]);
					genTest.setType_of_gene(row[9]);
					genTest.setSymbol_from_nomenclature_authority(row[10]);
					genTest.setFull_name_from_nomenclature_authority(row[11]);
					genTest.setNomenclature_status(row[12]);
					genTest.setOther_designations(row[13]);
					genTest.setModification_date(row[14]);
					genListTest.add(genTest);
				    System.out.println(genListTest.get(x).getSymbol());
					System.out.println(genListTest.get(x).getTax_id());
					System.out.println(row[1]);
					x++;
					System.out.println(genListTest.size());
				}
			}
		
			a++;
		}
		a=0;
		
		csvReader.close();
		
		return genListTest;
	}
	
	public ArrayList<Gen> bilgigonder(String genName) throws IOException
	{

		//System.out.println(genName);
		String csvFilename = "C:\\tez_proje\\son8.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename),'	');
		String[] row = null;
		genListTest = new ArrayList<Gen>();
		
		
		int a=0;
		int x =0;
		
		
		while((row = csvReader.readNext()) != null) {
			
			
				if(row[2].equals(genName)||row[1].equals(genName)||row[8].equals(genName))
				{
					Gen genTest = new Gen();
					genTest.setTax_id(row[0]);
					genTest.setGene_id(row[1]);
					genTest.setSymbol(row[2]);
					genTest.setLocusTag(row[3]);
					genTest.setSynonyms(row[4]);
					genTest.setDbXrefs(row[5]);
					genTest.setChromosome(row[6]);
					genTest.setMap_location(row[7]);
					genTest.setDescription(row[8]);
					genTest.setType_of_gene(row[9]);
					genTest.setSymbol_from_nomenclature_authority(row[10]);
					genTest.setFull_name_from_nomenclature_authority(row[11]);
					genTest.setNomenclature_status(row[12]);
					genTest.setOther_designations(row[13]);
					genTest.setModification_date(row[14]);
					genListTest.add(genTest);
				    System.out.println(genListTest.get(x).getSymbol());
					System.out.println(genListTest.get(x).getTax_id());
					System.out.println(row[1]);
					x++;
					System.out.println(genListTest.size());
				}
			
		
			a++;
		}
		a=0;
		
		csvReader.close();
		
		return genListTest;
	
	}
}

