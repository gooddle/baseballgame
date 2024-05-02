# 1.숫자 야구 게임

앞자리 수가 0이 아니고 중복 된 숫자 없이 정답을 맞추는 게임
숫자가 완전히 같다면 ex) 정답 :"123" 입력값 : "123" 정답 게임 종료
완전히 같지 않고 정답에 있는 숫자를 포함하면 볼 선언 ex) 정답 :"132" 입력값 : "123" 정답 게임 종료 -> 1스트라이크 2볼

# 2. 메뉴얼 설명 
1.게임시작 , 2.전적보기 , 3.게임종료



1번 선택시 게임 시작


2번 선택시 전적 보기 -> 게임을 최소 한판 이상을 진행해야 볼 수 있습니다.


3번 게임 종료 희망 시


# 3. 특징 
```
var answer = (0..9).shuffled().take(3)
while (answer[0] == 0) {
answer = (0..9).shuffled().take(3)
  }
 val number = answer.joinToString("")
```
1.매 게임마다 무작위로 바뀌는 정답 제공 

2.매 게임마다 자신의 시도 횟수 확인 가능

 # 4. 기능 설명 
 1. makeballs.kt 입력값과 정답 사이의 볼을 판정하는 기능
 2. makeCounts.kt 실제로 게임의 정답이 생성되고 기록 횟수가 저장되는 기능
 3. makeShow.kt 저장된 기록을 출력해주는 기능
 4. makeStrikes 입력값과 정답 사이의 스트라이크를 판정하는 기능 
