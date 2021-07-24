package sort;

class Point implements Comparable<Point> {
	
	
	
//	현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
//	현재 객체 == 파라미터로 넘어온 객체: 0 리턴
//	현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
//	음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
		
    int x, y;

    Point(int x,int y){
    	this.x = x;
    	this.y = y;
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
    public int compareTo(Point p) {
        if(this.x > p.x) {
            return 1; // x에 대해서는 오름차순
        }
        else if(this.x == p.x) { // x좌표가 같으면 
            if(this.y < p.y) { // y에 대해서는 내림차순
                return 1;
            }
        }
        return -1;
    }
}