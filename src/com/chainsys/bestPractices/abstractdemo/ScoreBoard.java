package com.chainsys.bestPractices.abstractdemo;

public class ScoreBoard {
	public int TargetScore=215;
	
	private ScoreBoard()
	{
		System.out.println("object created for ScoreBoared");
	}
	public static ScoreBoard createObject()
	{
		return new ScoreBoard();
		
	}
//	class TestScoreBoard
//	{
//		public static void main(String args[]) 
//		{
//			//ScoreBoard sb = new ScoreBoard();
//		}
//	}
//	

}
