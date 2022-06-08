package com.chainsys.bestPractices.abstractdemo;

public interface Ispelling 
{
	void spellCheck(String word);//must be implemented by all languages
	void CheckGrammer(String sentence);//must be implemented by all languages
	int wordCount(String Sentence);// the logic is the same for all language
}
abstract class Language implements Ispelling
{
	@Override
	public int wordCount(String Sentence) {
		String [] words = Sentence.split("");
		return words.length;
	}
}
class EnglishLanguage extends Language implements Ispelling
{

	@Override
	public void spellCheck(String word) 
	{
		System.out.println("English spellChecker");
		
	}

	@Override
	public void CheckGrammer(String sentence) 
	{
		System.out.println(" English Checkgrammer");
		
	}	
	class TamilLanguage extends Language implements Ispelling
	{

		@Override
		public void spellCheck(String word) 
		{
			System.out.println("Tamil spellChecker");
			
		}

		@Override
		public void CheckGrammer(String sentence) 
		{
			System.out.println(" Tamil Checkgrammer");
			
		}		
   }
	class FrenchLanguage extends Language implements Ispelling
	{

		@Override
		public void spellCheck(String word) 
		{
			System.out.println("French spellChecker");
			
		}

		@Override
		public void CheckGrammer(String sentence) 
		{
			System.out.println(" French Checkgrammer");
			
		}	
   }
	
}
