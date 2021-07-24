package sort;

import java.util.*;



public class Sort {

	public static void main(String[] args) {
		
		// 기본타입 배열 오름차순
		
		int arr[] = {4,23,33,15,17,19};
        Arrays.sort(arr);
        
        for (int i : arr) {
            System.out.print("["+i+"]");
	}
        System.out.println();
        
        // String 배열 오름차순 기본 타입과 동일
        // ----------------------------------------------------------------
        
        String arr2[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr2);
        
        for (String i : arr2) {
            System.out.print("["+i+"]");
        }

        System.out.println();
        
        // 기본타입 배열 내림차순 정렬
        // ----------------------------------------------------------------
        
        Integer arr3[] = {4,23,33,15,17,19};
        Arrays.sort(arr3,Collections.reverseOrder());
        
        for (int i : arr3) {
            System.out.print("["+i+"]");
        }
        
        String arr4[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr4,Collections.reverseOrder());
        System.out.println();
        
        
        // String 배열 내림차순 정렬
        // ----------------------------------------------------------------
        
        for (String i : arr4) {
            System.out.print("["+i+"]");
        }
     
        int arr5[] = {4,23,33,15,17,19};
        // int[] arr5 = {4,23,33,15,17,19};
        // int[] arr5 = new int[] {4,23,33,15,17,19};
        // int arr5[] = new int[] {4,23,33,15,17,19};
        // 다 동일
        
        Arrays.sort(arr5, 0, 4); // 0,1,2,3 요소만 정렬
        System.out.println();
        
        // 배열 일부분만 정렬 
        // ----------------------------------------------------------------
        
        for (int i : arr5) {
            System.out.print("["+i+"]");
        }
        System.out.println();
        
        //  객체 배열 정렬할시에는 comparable 이나 comparator을 사용해야 한다.
        // ----------------------------------------------------------------
        
        People[] arr6 = { new People("상현", 20)
                , new People("철수", 14)
                , new People("경완", 31)
                , new People("대호", 40)
                , new People("지운", 24) 
            };
    		
            Arrays.sort(arr6); //오름차순 정렬        
            
                        
            for (People i : arr6) { //오름차순 출력
                System.out.print("["+ i.getName() + i.getAge() +"]");
            }
    		
            Arrays.sort(arr6,Collections.reverseOrder()); // [철수(14)][상현(20)][지운(24)][경완(31)][대호(40)]
            System.out.println();
    		
            for (People i : arr6) { //내림차순 출력
                System.out.print("["+i.getName() + i.getAge()+"]"); //[대호(40)][경완(31)][지운(24)][상현(20)][철수(14)]
            }
         // ------------------------------------------------- Comparable
          
            System.out.println();
            
            List<Point> pointList = new ArrayList<Point>();
            pointList.add(new Point(5 , 4));
            pointList.add(new Point(3 , 9));
            pointList.add(new Point(2 , 1));
            
            Collections.sort(pointList);
            
            for (Point i : pointList) {
            	System.out.print(" X : "+ i.getX() + " Y : "+ i.getY());
            	System.out.println();
            }
         
            System.out.println();
         // -------------------------------------------------- Comparator
         // 만약 정렬 대상 클래스의 코드를 직접 수정할 수 없는 경우에는 어떻게 객체의 정렬 기준을 정의할 수 있을까요? 
         // 또는 정렬 하고자 하는 객체에 이미 존재하고 있는 정렬 기준과 다른 정렬 기준으로 정렬을 하고 싶을 때는 어떻게 해야할까요?
         
         // 첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
         // 첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
         // 첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
         
            
         Comparator<Point> myComparator = new Comparator<Point>() {
            	  @Override
            	  public int compare(Point p1, Point p2) {
            		  if (p1.x > p2.x) {
            	      return 1; // x에 대해서는 오름차순
            	    }
            	    else if (p1.x == p2.x) {
            	      if (p1.y < p2.y) { // y에 대해서는 내림차순
            	        return 1;
            	      }
            	    }
            	    return -1;
            	  }
            	};

            List<Point> pointList2 = new ArrayList<>();
            pointList2.add(new Point(1, 5));
            pointList2.add(new Point(5, 19));
            pointList2.add(new Point(3, 7));
            Collections.sort(pointList2, myComparator); // myComparator에 선언한대로 정렬
            
            for (Point i : pointList2) {
            	System.out.print(" X : "+ i.getX() + " Y : "+ i.getY());
            	System.out.println();
            }
            
         // 참고 Arrays.sort()와 Collections.sort()의 차이
         // Arrays.sort() 배열 정렬의 경우 vs Collections.sort() List Collection 정렬의 경우

	}
	
}


