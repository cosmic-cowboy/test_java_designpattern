package com.slgerkamp.designpattern.iterator.techscore;

/**
 * 参考：Iteratorパターン
 * http://www.techscore.com/tech/DesignPattern/Iterator/Iterator1.html/
 * 
 * 要素の集まりを保持する集約オブジェクト
 * 各オブジェクトへ順番にアクセスする方法を提供
 * 
 */
public class StudentList{

	// オブジェクトを保持する配列
	protected Student[] studnents;
	// 配列の最後尾
	private int last = 0;

	public StudentList(int studentCount) {
		studnents = new Student[studentCount];
	}
		
	/**
	 * 引数で指定した順番のオブジェクトにアクセスするするための振る舞い
	 * @param index
	 * @return
	 */
	public Student getStudentAt(int index){
		// indexが整数でかつlastより小さいことを確認する
		// この際、nullを返却しているが、Optionalを使ってabsentで返した方が良いかも
		if(index < 0 || index > last){
			return null;
		}
		return studnents[index];
	}
	
	// オブジェクト追加
	public void add(Student student){
		studnents[last] = student;
		last++;
	}
	
	// 保持している最後の順番を返却
	public int getLastNum(){
		return last;
	}
	
}
