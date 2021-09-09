package selectionsort;

public class B_Code {

	public static void main(String[] args) {
		int iArray[]= {10, 8, 6, 2, 9, 5, 0, 4, 3, 1, 7};
		int minNum;

		for(int i=0;i<iArray.length-1;i++) {         
			for(int j=i+1;j<iArray.length;j++) {     
				if(iArray[i]>iArray[j]) {       
					minNum=iArray[j];           
					iArray[j]=iArray[i];        
					iArray[i]=minNum;			
				}
			}
		}
		 
		System.out.println("===== 정렬된 상태 ======");
		for(int i=0;i<iArray.length;i++) {
			System.out.print(iArray[i]+" ");
			}
	}

}
