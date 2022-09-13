package pack01;

public class _08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		a++; /*a=a+1*/
		System.out.println(a); /*a=41*/
		System.out.println(a+1); /*실제 a의 값은 변함이 없다 출력에만 +1 한 것 42로 출력*/
		System.out.println(a); /*a=41*/
		System.out.println(++a); /*연산자가 들어갔기 때문에 실제 a의 값에도 변화가 생김 42로 출력*/
		System.out.println(a); /*a=42*/
		System.out.println(a++) ;
		/*연산자가 들어갔기 때문에 실제 a의 값에도 변화가 생김 그렇지만 a먼저 출력후 연산자++실행*/
		/* 42로 출력*/
		System.out.println(a); /*a=43*/
			
		
		//전위연산자와 후위연산자 공부 방법
		//언어마다 시점이 조금씩은 다릅니다. 
		//자바에서는 ;이 의미하는 바가 명령문의 끝
		//System.out.println(a++) 이것이 하나의 명령문 블록
		//전위연산자는 명령어 블록이 시작하기 전에 연산이 이루어집니다.
		//후위연산자는 명령어 블록이 끝난 시점에 연산이 이루어집니다.
		// System.out.println(a++) 이 의미하는 바는 a를 출력한 뒤 a++로 저장한다
     	//System.out.println(++a); 이 의미하는 바는 ++a를 출력하고 저장
		
		
		int aa=40;
		int bb=30;
		int cc=20;
		int dd=2;
		int ee=4;
		
		System.out.println(++aa); 
		/* aa+1후 출력 실제 aa데이터도 변경
		 * 출력 41 */
		System.out.println(aa);
		/*aa=41*/
		System.out.println(++aa+bb++);
		/* (aa+1)+bb 로 출력 후 bb값에 +1됨 
		 * 72출력 
		 * aa=42 bb=31*/
		System.out.println(--cc+(-aa));
		/*cc-1+(-aa) ->(20-1)+(-42) =-23
		 * -23으로 출력
		 * aa=42 cc=19*/
		System.out.println(cc+2);
		/* cc+2 실제 cc값은 변동되지 않는다 
		 * 출력 21
		 * cc=19*/
		System.out.println(cc);
		/*cc=19*/
		System.out.println(--cc*(ee-dd)+dd++);
		/* (cc-1)*(ee-dd+dd) 후 dd=dd+1 실행 
		 * (19-1)*(4-2)+2
		 * 출력 38
		 * aa=42, bb=31, cc=18, dd=3
		 */
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		
		
	}

}
