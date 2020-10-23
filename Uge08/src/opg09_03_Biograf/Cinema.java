package opg09_03_Biograf;

public class Cinema {
	private boolean[][] seats;

	public Cinema(int[] seatsOnRows) {
		int rows = seatsOnRows.length;
		seats = new boolean[rows][];
		for(int i=0; i<rows; i++){
			seats[i] = new boolean[seatsOnRows[i]];
		}
	}

	public int rows(){
		return seats.length;
	}

	public int seatsOnRow(int row){
		if (row<seats.length && row >= 0) return seats[row].length;
		return 0;
	}

	public int seats(){
		int seatCount = 0;
		for(boolean[] row : seats){
			seatCount += row.length;
		}
		return seatCount;
	}

	public int rowVacancies(int row){
		if (row<seats.length && row >= 0){
		int vacancies = 0;
		for(boolean taken : seats[row]){
			if(!taken){vacancies++;}
		}
		return vacancies;
		} else return 0;
	}

	public int vacancies(){
		int vacancies = 0;
		for(boolean[] row : seats){
			for(boolean taken : row){
				if(!taken){vacancies++;}
			}
		}
		return vacancies;
	}

	public void booking(int row, int seat){
		if (row>=0 && row<seats.length && seat >=0 && seat<seats[row].length)
		seats[row][seat] = true;
	}

	public void release(int row, int seat){
		if (row>=0 && row<seats.length && seat >=0 && seat<seats[row].length)
		seats[row][seat] = false;
	}

	public String toString(){
		String str = "";
		for(int i=0; i<seats.length; i++){
			for(int j=0; j<seats[i].length; j++){
				if(seats[i][j]){str += "#";}
				else{str += "0";}
			}
			str += "\n";
		}
		return str;
	}
}