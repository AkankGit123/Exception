package com.rays.Exception;

public class ProgramedException extends Exception {
	
	public ProgramedException() {
		super("Login exception: User not found");
	}
	
	public static class FamilyPropagationChecked{
		public static void main(String[]args)
		{
			dad();
		}

		private static void dad() {
				mom();
		}

		private static void mom() {
			try {
				son();
			} catch (ProgramedException e) {
				
				System.out.println(e);
			}
			
		}

		private static void son() throws ProgramedException {

			ProgramedException e = new ProgramedException();
			throw e;
			
		}
		
		
		
	}
	

}
