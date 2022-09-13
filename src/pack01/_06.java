package pack01;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] partName= {"java","mysql","oracle","html","css"}; //값을 지정해서 배열을 만들 수 있다.
		int [] point= new int[5]; //new는 암기, 앞의 int[]: int를 저장하는 자료형을 선언
		                          // point 변수명(여기서는 배열 변수명)
		                          // 뒤에 int[5] 배열의 크기: 5개의 int를 저장할 수 있는 공간
								//  퀴즈. 인덱스는 어떻게 구성될까요 A. 0~4까지 방으로 구성
						// 0번방에 JAVA점수,1번방에 MYSQL 점수~ 의도로 배열을 만들었다.라고 개발자가 정의
		
		point[0]=80; //point배열의 0번 인덱스의 value의 값을 숫자 80자료를 저장한다.
					//13번의 코드만 분석하면 80은 JAVA 점수를 저장한 것이다. (X)
		point[1]=90; //point배열의 1번 인덱스의 value의 값을 숫자 90자료를 저장한다.
		point[2]=58;
		point[3]=49;
		point[4]=93;
		// 2번 INDEX에 있는 VALUE값을 출력하겠다
		System.out.println(point[0]);
		System.out.println(point[1]);
		System.out.println(point[2]);
		System.out.println(point[3]);
		System.out.println(point[4]);
		// 포인트는 떨어져있는 자료형을 하나로 컨트롤 하기 위해 배열로 바꾼 것! 라인수를 줄이기 위해서는 더 배워야한다.
		
		System.out.println(partName[0]+" "+point[0]); /*java 80*/
		System.out.println(partName[1]+" "+point[1]); /*mysql 90*/
		System.out.println(partName[2]+" "+point[2]); /*oracle 58*/
		System.out.println(partName[3]+" "+point[3]); /*html 49*/
		System.out.println(partName[4]+" "+point[4]); /*css 93*/
		
		String [] fruit = new String[4];
		fruit[0]="apple";
		fruit[3]="melon";
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]);

		
		
	}

}
