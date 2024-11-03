package cse.oop2.question;


import java.util.ArrayList;

public class Questions {}

// 58 페이지 문제
/*
class page58{
    public static void main(String[] args){
        int bottlesNum = 10; // camelCase
        String word = "bottles"; // camelCase

        while(bottlesNum > 0){ // bottleNum 이 0보다 크다면 반복문 실행
            System.out.println(bottlesNum + " green " + word + ". hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ". hanging on the wall");
            System.out.println("And if one green " + word + " should accidentally fall. ");
            bottlesNum--;

            if(bottlesNum > 0){
                // if 문을 해당 부분으로 옮겼습니다.
                if(bottlesNum == 1){ // bottle 의 개수가 1개가 남는다면
                    word = "bottle"; // 단수형으로 바꾸기
                }

                // bottles 부분을 word 변수로 대체 하였습니다.
                System.out.println("There'll be " + bottlesNum + " green " + word + " hanging on the wall");
            }
            else {
                // bottles 부분을 word 변수로 대체 하였습니다.
                System.out.println("There'll be no green " + word + " ,hanging on the wall");
            }
            System.out.println("-------------------------");
        }
    }
}
 */

// 62 페이지 문제
/*
// 1번째
class Shuffle1 {
    public static void main(String[] args) {
        // 2번째
        int x = 3;

        // 3번째
        while (x > 0) {

        // 4번째
            if (x > 2) { // x : 3
                System.out.print("a");
            }

        // 5번째
            x = x - 1;  // 1번째 반복 x : 2
                                // 2번째 반복 x : 1
            System.out.print("-");

        // 6번째
            if ( x == 2 ){
                System.out.print("b c");
            }
        // 7번째
            if ( x == 1){
                System.out.print("d");
                // x : 0 반복을 종료하기 위한 코드
                x = x - 1;
            }
        }
    }
}
 */

// 63 페이지 문제
/*
// A 번
class A{
    public static void main(String[] args) {
        int x1 = 1;
        while ( x1 < 10){

            // 추가 된 코드
            x1 = x1 + 1; // 없을 시 무한 반복문
            if ( x1 > 3 ){
                System.out.println("big x");
            }
        }
    }
}

// B 번
// 추가 된 코드 [1]
// main 메서드는 항상 클래스안에 위치하여야 한다.
class B{
    public static void main(String[] args) {
        int x2 = 5;
        while ( x2 > 1){
            x2 = x2 - 1;
            if ( x2 < 3 ){
                System.out.println("small x");
            }
        }
    }
}
//C 번
class C{

// 추가 된 코드 [1]
// 메인 메서드가 있어야 프로그램을 실행 할 수 있다.
public static void main(String[] args) {
    int x3 = 5;
    while ( x3 > 1){

        // 추가 된 코드
        x3 = x3 - 1; // 없을 시 무한 반복문

        if ( x3 < 3 ){
            System.out.println("small x");
        }
    }
}
*/
    
// 65 페이지 문제
/*
class page65 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {

            // 00 10 21 32 42
            // y = x - y;

            // 00 11 23 36 410
            // y = x + y;

            // 02 14 25 36 47
            //y = y + 2;
                //if ( y > 4 ){
                    //y = y - 1;
                //}

            // 11 34 59
            //x = x + 1 ;
            //y = y + x ;

            // 02 14 36 48
            //if ( y < 5 ){
                //x = x + 1;
                //if ( y < 3){
                    //x = x - 1;
                //}
            //}
           //y = y + 2;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
*/

// 84 페이지 문제
/*
// A
class StreamingSong { // PascalCase
    String title;
    String artist;
    int duration;

    void play() { // camelCase
        System.out.println("Playing Song");
    }

    void printDetails() { // camelCase
        System.out.println("this is " + title + " by " + artist);
    }
}
class StreamingSongTestDrivc {
    public static void main(String[] args) {

        // 추가 된 코드 [1]
        // 객체를 생성하지 않았습니다
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}

// B
class Episode { // PascalCase
    int seriesNumber;  // camelCase
    int episodeNumber; // camelCase

    void skipIntro() {  // camelCase
        System.out.println("Skipping intro. . .");
    }

    void skipToNext() { // camelCase
        System.out.println("Loading next episode. . .");
    }

    // 추가 된 부분 [1]
    // play 메서드가 작성 되어 있지 않음
    void play() { // camelCase
        System.out.println("Playing episode. . .");
    }
}

class EpisodeTestDrive { // PascalCase
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play(); // 해당 메서드 구현이 되어 있지 않습니다.
        episode.skipIntro();
    }
}
*/

// 85 페이지 문제
/*
// [1]
class DrumKit { // PascalCase

    // [2]
    boolean topHat = true;
    boolean snare = true;

    // [3]
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    // [4]
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

// [5]
class DrumKitTestDrive { // PascalCase
    public void main(String[] args) {
        //[6]
        DrumKit d = new DrumKit();

        // [7]
        d.snare =false;

        // [8]
        if(d.snare == false){
        d.playSnare();
        }

        // [9]
        d.playTopHat();
    }
}
 */

// 86 페이지 문제
/*
class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();

        // 답 : Echo e1 = new Echo();
        // 답 : Echo e2 = e1;
        Echo e2 = new Echo();

        int x = 0;
        while (x < 4) {
            e1.hello();

            // 답 :  e1.count = e1.count + 1;
            e1.count = e1.count + 1;

            // 답 : x == 3
            if (x == 3) {
                e2.count = e2.count + 1;
            }

            // 답 : x > 0
            if (x > 0) {
                // e2.count += e1.count;
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count); // e2count 가 최종으로 10이 나와야함
    }
}
// 답 : Echo
class Echo {
    // 답 : count
    int count = 0;

    // 답 : hello()
    void hello() {
        System.out.println("helloooo...");
    }
}
 */

// 87 페이지 문제
/*
class TextQuestion87{

        // 저는 java 파일을 컴파일 하면 만들어 집니다. 객체

        // 저는 인스턴스 변수의 값은 다른 친구의 값과 다를 수 있습니다. 객체

        // 저는 템플릿 처럼 동작합니다. 클래스

        // 저는 (무언가 하는)작업하는 것을 좋아합니다. 객체, 메서드

        // 저는 메서드를 여러 개 를 가질 수 있습니다. 클래스, 객체

        // 저는 상태를 나타냅니다. 인스턴스 변수

        // 저는 특정 행동을 할 수 있습니다. 객체, 클래스

        // 저는 객체 안에 들어 있습니다. 인스턴스 변수, 메서드

        // 저는 힙 안에서 산 답니다. 객체

        // 저는 객체의 인스턴스를 만들기 위한 용도로 쓰입니다. 클래스

        // 제 상태는 바뀔 수 있죠. 객체, 인스턴스 변수

        // 저는 메서드를 선언 합니다. 클래스

        // 저는 실행 중에 바뀔 수 있습니다. 인스턴스 변수

}
*/

// 105 페이지 문제
/* A
class Books{
    String title;
    String author;
}
class BooksTestDrive{
    public static void main(String[] args){
        Books[] myBooks = new Books[3];

        int x = 0;
        // 추가 된 코드 [1]
        // 배열 공간 별로 별도의 객체 생성이 필요하다.
        // 즉 크기만 할당한 상태이고 템플릿은 없는 것이다.
        for (int i = 0; i < 3; i++) {
            myBooks[i] = new Books();
        }

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "BoB";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
        }
    }
}
/* B
class Hobbits {
    String name;

    public static void main(String []args){
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        // 변경 된 코드 [1]
        // z < 3 배열의 크기가 3이므로 2번 인덱스 까지 존재하므로
        // 3번 인덱스까지 연산할 시 오류가 난다.
        while ( z < 3 ){
            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if ( z == 1 ){
                h[z].name = "frodo";
            }
            if ( z == 2 ){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.print("good Hobbit name");
            System.out.println("");

            // 변경 된 코드 [1]
            // 위 구문이 종료 된 후 z 값증가
            z = z + 1 ;
        }
    }
}
*/

// 106 페이지 문제
/*
// [1]
class TestArrays{
    public static void main(String[] args) {
        // [2]
        String[] islands = new String[4];
        // [3]
        int[] index = new int[4];

        // [4]
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // [5]
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        // [6]
        int y = 0;
        // [7]
        int ref;
        while (y < 4) {
            // [8]
            ref = index[y];\
            // [9]
            System.out.print("island = ");
            // [10]
            System.out.println(islands[ref]);
            // [11]
            y = y + 1;
        }
    }
}
*/

// 107 페이지 문제
/*
class Triangle{
    double area;
    int height;
    int length;

    // 이런식으로 테스트 클래스에 메인 메서드가 들어가는 경우도 있다함
    public static void main(String [] args){
        // 답: int x = 0;
        int x = 0;

        // 답: Triangle[] ta = new Triangle[4];
        Triangle[] ta = new Triangle[4];

        // 답: x < 4
        while(x < 4){
            // 답: ta[x] = new Triangle();
            ta[x] = new Triangle();
            // 답: ta[x]
            ta[x].height = ( x + 1 ) * 2;
            // 답: ta[x]
            ta[x].length = x + 4;
            // 답: a[x].setArea();
            ta[x].setArea();

            System.out.print("triangle" + x + " area");
            // 답: ta[x]
            System.out.println(" = " + ta[x].area);
            // 답: x = x + 1;
            x = x + 1;
        }
        // 답: int y = x;
        int y = x;
        x = 27;
        Triangle t5 = ta[2]; // 앑은 복사
        ta[2].area = 343; // t5 는 ta[2]의 메모리 주소를 가진다
        System.out.print("y = " + y );
        System.out.println(", t5 area = " + t5.area); // ta[2]의 area 343 출력
    }
    void setArea(){
        area = (height * length) / 2;
    }
}
 */

// 108 페이지 문제
/*
class HeapQuiz{
    int id = 0;

    public static void main(String[] srgs){
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while(x < 3){
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        // hq[0]; id: null
        // hq[1]; id: 1
        // hq[2]; id: null
        // hq[3]; id: 2
        // hq[4]; id: 0
    }
}
*/

// 130 페이지 문제
/*
// A 오류가 존재하지 않습니다.
class XCopy{
    public static void main(String []args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
// B
class Clock {
    String time;

    void setTime(String t){
        this.time = time;
    }
    // void 가 아닌  String 형식으로 변경해 줘야합니다.
    String getTime(){
        return time;
    }
}
class ClockTestDrive{
    public static void main(String []args) {
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time : " + tod);
    }
}
*/

// 135 페이지 문제
/*
class TextQuestion135{
    // 인스턴스 변수, 인자, 리턴값, return 문, 게터, 세터, 캡슐화, public, private, 값으로 전달, 메서드

    // 클래스에 들어갈 수 있는 이것의 개수에는 제한이 없습니다. [인스턴스 변수, 메서드]

    // 이것은 메서드에 하나밖에 들어갈 수 없습니다. [return 문]

    // 이것은 자동으로 더 큰 타입이 될 수 있습니다. [리턴값, 인자] ☆☆

    // 저는 인스턴스 변수가 private 인 것을 좋아합니다. [캡슐화]

    // 원래는 복사본을 만든다 라는 듯이 있습니다. [값으로 전달]

    // 세터에서만 이 값을 갱신할 수 있습니다. [인스턴스 변수] ☆☆

    // 이것은 메서드에 많이 들어갈 수 있습니다. [인자]

    // 저는 반드시 뭔가를 리턴해야 합니다. [게터]

    // 인스턴스 변수에 대해서는 사용할 수 없습니다. [public]

    // 인자 여러 개를 가질 수 있습니다. [메서드]

    // 반드시 인자 하나만을 받을 수 있습니다. [세터]

    // 캡슐화에 도움이 되지요. [세터, 게터, public, private]

    // 항상 하나뿐입니다. [리턴값]
}
*/

// 132 페이지 문제
/*
class Mix4{
    int counter = 0;

    public static void main(String [] args){
        int count = 0;

        Mix4[] mixes = new Mix4[20];

        int i = 0;
        while (i < 20){
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
        }
        System.out.println(count + " " + mixes[1].counter);
    }
    public int maybeNew(int index){
        if (index < 5){
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
// 정답
// i < 9    , index < 5     => 14, 1
// i < 20   , index > 5    => 25,1
// i < 7    , index < 7     => 14, 1
// i < 19   , index <1     => 20, 1
*/

// 160 페이지 문제
/*
class Output{
    public static void main(String []args){
        Output output = new Output();
        output.go();
    }
    void go(){
        int value = 7;
        for(int i = 1; i < 8;i++){
            value++; // i:6  value:14
            if(i > 4) {
                System.out.println(++value + " "); // value: 13 , 15
            }
            if(value > 14){
                System.out.println(" i = " + i);  // i = 6
                break;
            }
        }
    }
}
// 정답
// 13 15 i = 6
*/

// 161 페이지 문제
/*
class MultiFor{
    public static void main(String []args){
        for(int i = 0; i < 4; i++){
            for(int j = 4; j > 2; j--){
                System.out.println(i + " " + j);
            }
            if (i == 1){
                i++;
            }
        }
    }
}
 */

// 163 페이지 문제
/*
class page163{
    public static void main(String [] args){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++) { // 0 1 2
            for (int inner = 4; inner > 1; inner--) { // 4 3 2
                // x += 6;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x +" "+ y);
    }
}

 */

// 176 페이지 문제
/*
class 176pages{
    public static void main(String [] args){
        ArrayList<String> myList = new ArrayList<String>();
        // String[] myList = new String[2];

        String a = "whoohoo";
        myList.add(a);
        // String a = "whoohoo";
        // myList[0] = a;

        String b = "Frog";
        myList.add(b);
        // String b = "Frog";
        // myList[1] = b;

        int theSize = myList.size();
        // myList.length;

        String str = myList.get(1);
        // String str = myList[1];

        myList.remove(1);
        // myList[1] = null;

        boolean isIn = myList.contains(b);
        // boolean isIn = false;
        // for(String str : myList){
        //   if(str.equals(b)){ isIn = true; break;};
        //}
}
 */
