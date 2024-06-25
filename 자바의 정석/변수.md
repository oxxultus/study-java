
# 자바를 시작하기 전
> 자바에서 모든 코드는 클래스 안에 존재해야하며 서로 관련된 코드들을 그룹으로 나누어 별도의 클래스를 구성하게 된다. 그리고 이 클래스 들이 모여 하나의 java 애플리케이션을 이룬다.
## 클래스를 작성하는 방법
```java 
class 클래스이름{
	// 해당 괄호 안에 코드를 작성해야한다.
}
```
```java 
class 클래스이름{
	// 해당 부분은 main 메서드의 선언부인데 프로그램을 실행할 때 
	// 'java.exe'의해 호출될 수 있도록 약속된 부분이므로 항상 똑같이 적어주어야한다.
	public static void main(String[] args){ 
		// 실행될 문장들을 적는다.
	}
}
```
- 모든 클래스가 main 메서드를 가지고 있어야 하는것은 아니다.
- 하나의 java 애플리케이션에는 main메서드를 포함한 클래스가 반드시 하나는 있어야한다.
- 하나의 소스파일에 둘 이상의  public class가 존재하면 안된다.
- 소스파일의 이름이 public class의 이름과 일치하거나 public class가 없으면 class이름 중 하나와 반드시 일치해야 한다.
- 하나의 소스파일에 둘 이상의 클래스를 정의하는 것도 가능하다. 이 때 주의해야할 점은 ' 소스파일의 이름은 public class의 이름과 일치해야 한다.' 는 것이다. 만일 소스파일 내에 public class가 없다면, 소스파일의 이름은 소스파일 내의 어떤 클래스의 이름으로 해도 상관없다.

> 파일이름 : **Hello2**.java
```java 
public class Hello2{}
class Hello3{}
// public class 가 있는 경우, 소스파일의 이름은 반드시 public class의 이름과 일치해야한다.
```
> 파일이름 : **Hello2**.java, **Hello3**.java
```java 
class Hello2{}
class Hello3{}
// public class가 하나도 없는 경우, 소스파일의 이름은 Hello2.java나 Hello3.java 둘다 가능하다.
```

# 변수 
> 단 하나의 값을 저장할 수 있는 메모리 공간

## 변수의 명명규칙
1. 대소문자가 구분되며 길이에 제한이 없다.
```java 
True 와 true 는 서로 다른 것으로 간주된다.
```
2. 예약어를 사용해서는 안된다.
```java 
true는 예약어라서 사용할 수 없지만, True는 가능하다.
```
3. 숫자로 시작해서는 안된다.
```java 
top10은 허용 하지만, 7up은 허용되지 않는다.
```
4. 특수문자는 _ 와 $ 만을 허용한다.
```java 
$harp은 허용되지만, $#arp은 허용되지 않는다.
```
> 그 외의  자바에서 권장하는 규칙
5. 클래스 이름의 첫 글자는 항상 대문자로 한다.
```java 
단 변수와 메서드의 이름의 첫 글자는 항상 소문자로 한다.
```
6. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
```java 
변수: lastIndexOf // 첫 글자는 소문자 (중요)
클래스: StringBuffer // 첫 글자는 대문자 (중요)
```
7. 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 _ 로 구분한다.
```java 
PI, MAX_NUMBER, SIZE
```

## 변수의 타입
### 기본형
> 기본형 변수는 실제 값(data)을 저장한다.
- 논리형(boolean) 문자형(char), 정수형(byte, short, int, long), 실수형(float, double)
- 계산을 위한 실제 값을 저장한다. 총 8개

### 참조형
> 참조형 변수는 어떤 값이 저장되어 있는 주소(memory adress)를 값으로 갖는다.
- 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입.
```java 
클래스이름 변수이름; // 변수의 타입이 아닌 것들은 모두 참조변수이다.
```
```java 
// Date 클래스가 있다고 가정하고
Date today = new Date(); //Date의 객체를 생성해서 그 주소를 today에 저장한다.
```

## 변수의 선언과 초기화
> 변수를 사용하기 전에 처음으로 값을 저장하는 것
```java 
int age = 25; // int 형태의 변수 age를 선언하고 25로 초기화 한다.
```
```java 
int a;
int b; -> int a, b; // 해당 방식으로 사용 가능하다.
```
```java 
int x = 0;
int y = 0; -> int x = 0, y = 0; // 해당 방식으로 초기화 가능하다.
```

## 상수
> 상수는 변수와 마찬가지로 '값을 저장할 수 있는 공간'이지만, 변수와 달리 한번 값을 저장하면 변경할 수 없다. 상수의 선언 방법은 변수와 동일하며 변수의 타입 앞에 final을 붙혀주기만 하면된다.
```java 
// 중요: 상수는 선언과 동시에 초기화 해야한다.
final int MAX_NUMBER = 10; // 상수 MAX_NUMBER 선언 및 초기화
```
## 리터럴
> 그 자체로 값을 의미하는 것 
1. 리터럴에 접미사가 붙는 타입은 long , float, double 뿐인데 double은 생략 가능하므로 long과 float의 리터럴에 접미사를 붙이는 것만 신경쓰면 된다.
2. long -> d, D의 접미사를 사용하면 된다.
3. float -> f, F의 접미사를 사용하면 된다.
```java 
int age = 25; // 25에 해당하는 부분이다.
```

### 문자 리터럴 과 문자열 리터럴
> 'A'와 같이 작은따옴표로 문자 하나를 감싼 것을 '문자 리터럴' 이라고 하며, 두 문자 이상은 큰 따옴표로 감싸야 하며 "문자열 리터럴" 이라고 한다.
```java 
char ch = 'J'; // char ch = 'Java'; 이렇게 할 수 없다.
String name = "Java"; // 변수 name에 문자열 리터럴 "Java"를 저장 
```
> 문자열 리터럴은 안에 아무런 문자도 넣지 않는 것을 허용하며, 이를 빈 문자열 이라고 한다. 그러나 문자 리터럴은 반드시 안에 하나의 문자가 있어야한다.
```java 
String str = ""; // 내용이 없는 빈 문자열
char ch = ' '; // 공백 문자 하나로 변수 ch를 초기화
char ch = ''; // 오류: 반드시 하나의 문자가 필요
```
> 덧셈 연산자는 피연산자가 모두 숫자일 때는 두 수를 더하지만, 피연산자 중 어느 한쪽이 String이면 나머지 한 쪽을 먼저 String 으로 변환한 다음 두 String 을 결합한다. 즉 기본형과 참조형의 구별 없이 어떤 타입의 변수도 문자열과 덧셈연산을 수행하면 그 결과가 문자열이 되는것이다.
```java 
String name = "Ja"+"va"; //name은 "Java"
String str = name + 8.0; // str은 "Java8.0"
```

## 형식화된 출력 - printf()
> 일반적으로 \n를 사용하지만 OS별로 줄바꿈 문자가 다를 수 있기에 %n을 사용하라
```java 
System.out.printf("",변수 혹은 리터럴); // 나머지는 c언어와 동일하다.
// 만약 문자를 정수형으로 변경하거나 하는 경우에는 반드시 형변환을 해야한다.
```
|지시자|설명|
|--|--|
|%b|불리언(**b**oolean) 형식으로 출력|
|%d|10진(**d**ecimal) 정수의 형식으로 출력. 일반적인 정수|
|%o|8진(**o**ctal) 정수의 형식으로 출력|
|%x,%X|16진(he**x**a-decimal) 정수의 형식으로 출력|
|%f|부동 소수점(**f**loating-point)의 형식으로 출력|
|%e, %E|지수(**e**xponent) 표현식의 형식으로 출력|
|%c|문자(**c**haracter)로 출력|
|%s|문자열로(**s**tring) 출력|
```java 
System.out.printf("[%전체자리.소수점아래자리f]",변수 혹은 리터럴);
// [%전체자리.소수점아래자리f] 의 형식을 사용하면 원하는 만큼 출력 가능하다
```
```java 
[%s] // 문자열의 길이 만큼 출력 공간을 확보
[%20s] // 최소 20글자 출력공간 확보(공백이 있는 경우 우측정렬)
[%-20s] // 최소 20글자 출력공간 확보(공백이 있는 경우 좌측정렬)
[%.8s] // 왼쪽에서 8글자만 출력
```

## 화면에서 출력받기 - Scanner
> 화면으로 부터 입력받는 방법들은 근본적으로 모두 같으므로 차이를 비교할 필요는 없다.
> 그저 상황에 맞는 편리한 것을 선택해서 사용하면 된다.
```java
import java.util.*; // Scanner클래스를 사용하기 위해 추가
```
```java
Scanner scanner = new Scanner(System.in) // Scanner 클래스의 객체를 생성
```
```java
String input = scanner.nextLine(); // 입력받은 내용을 input에 저장

byte num = Byte.parseByte(input); // 입력받은 내용을 byte타입의 값으로 변환
short num = Short.parseShort(input); // 입력받은 내용을 short타입의 값으로 변환
int num = Integer.parseInt(input); // 입력받은 내용을 int타입의 값으로 변환
long num = Long.parseLong(input); // 입력받은 내용을 long타입의 값으로 변환
float num = Float.parseFloat(input); // 입력받은 내용을 flaot타입의 값으로 변환
double num = Double.parseDouble(input); // 입력받은 내용을 double타입의 값으로 변환
```
> 변환없이 숫자로 바로 입력받을 수 있는 메서드들이 있다.
```java
int num = scanner.nextInt(); // 정수를 입력받아서 변수 num에 저장
```
## 형변환
> 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
> (타입) 피연산자
```java
double d = 85.4;
int score = (int)d; // 변수 d를 int형으로 형변환 하여 score에 저장한다.
```
### 자동 형변환
#### 자동 형변환의 규칙
> 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
1. boolean 을 제외한 나머지 7개의 기본형은 서로 형 변환이 가능하다.
2. 기본형과 참조형은 서로 형변환 할 수 없다.
3. 서로 다른 타입의 변수간의 연산은 형 변환을 하는것이 원칙이지만, 값의 범위가 작은 타입에서 큰 타입으로의 형 변환은 생략할 수 있다.
##### byte -> short -> int -> long -> float -> double
##### char -> int -> long -> float -> double
```java
float f = 1234; // 형변환의 생략
// float f = (float)1234; 와 동일하다.
```
```java
byte b = 1000; // 에러 byte의 범위(-128~127)를 넘는 값을 저장.
```
```java
char ch = (char)1000; // 명시적 형변환, 오류가 발생하지 않는다.
```
