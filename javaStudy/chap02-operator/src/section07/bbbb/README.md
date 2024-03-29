### 비트 연산자

<p>
	비트 연산자
	비트연산자의 경우 다른 연산자들 보다 속도가 빠르다는 장점이 있다.
	컴퓨터가 연산을 할 때 사용하는 숫자 체계는 2진수(비트)를 사용하기에
	다른 연산의 경우 해석의 과정이 필요하지만 비트 연산의 경우 해석 없이 의미를 전달하기에 처리속도가 빠르다.
	<br/>
	하지만 일반 자바 개발자들은 비트 연산자를 학습하는 사람이 드물기도 하고, 의미를 직관적으로 알 수 없기 때문에
	거의 허용하지 않지만, 그래픽이나 이미지 등을 처리하는 프로그래밍에서는 많이 사용된다.
	구체적으로 숙달까지는 아니더라도 어떤 의미인지만 가볍게 학습하고 넘어가자.
	</p>
	
### 비트 연산자의 종류

1. & : 대응되는 비트가 모두 1이면 1을 반환함 (비트 and 연산)
2. | : 대응되는 비트가 둘 중 하나라도 1이면 1을 반환함 (비트 or 연산)
3. ^ : 대응되는 비트가 서로 다르면 1을 반환함 (비트 xor 연산)
4. ~ : 비트를 1이면 0으로, 0이면 1로 반전시킴 (비트 not 연산, 1의 보수)
5. << : 명지된 수 만큼 비트를 전부 왼쪽으로 이동 시킴 (left shift 연산)
6. >> : 부로를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴 (right shift 연산)
7. >>> : 지정한 수만큼 비트를 전부 오른쪽으로 이동시키며 새로운 비트는 전부 0이됨