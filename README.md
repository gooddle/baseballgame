[1] About the Project


숫자 야구 게임

앞자리 수가 0이 아니고 중복 된 숫자 없이 정답을 맞추는 게임
숫자가 완전히 같다면 ex) 정답 :"123" 입력값 : "123" 정답 게임 종료
완전히 같지 않고 정답에 있는 숫자를 포함하면 볼 선언 ex) 정답 :"132" 입력값 : "123" 정답 게임 종료 -> 1스트라이크 2볼

[2] Features
                    var answer = (0..9).shuffled().take(3)
                    while (answer[0] == 0) {
                        answer = (0..9).shuffled().take(3)
                    }
                    val number = answer.joinToString("")

최고 멋진 README를 쉽게 작성할 수 있도록 이텔릭체로 된 가이드를 제공
뱃지로 언어 옵션을 제공
