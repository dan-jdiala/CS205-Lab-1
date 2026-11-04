package edu.monmouth.employee;

public class PieceEmployee implements Employee {
	
	private int ratePerPiece;
	private int piecesMade;
	
	public PieceEmployee(int ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}
	
	public int getMonthlyPay() {
		return this.ratePerPiece * this.piecesMade;
	}
	
	public void setPiecesMade(int piecesMade) {
		this.piecesMade = piecesMade;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		
		if (otherObject == null) {
			return false;
		}
		
		if (this.getClass() != otherObject.getClass()) {
			return false;
		}
		
		if (this == otherObject) {
			return true;
		}
		
		PieceEmployee otherEmployee = (PieceEmployee) otherObject;
		return this.ratePerPiece == otherEmployee.ratePerPiece && this.piecesMade == otherEmployee.piecesMade;
		
	}
	
	@Override
	public String toString() {
		return "Rate per piece: $" + this.ratePerPiece + " | Pieces made: $" + this.piecesMade;
	}

}
