# calculator
# Introduction
# 1.1 Project Overview
The goal of this project is to create a calculator which requires java programming code. It is an expression calculator which evaluates the expression in the context it is given. It does both symbolic and numeric computation. User will see a calculator with numbers and symbols which does basic mathematic calculation. User can enter an expression they want to calculate, and it will give the answer.
# Technical Overview
This project is an Object-Oriented Design programming code. To implement an expression evaluator is the main goal of the project. String Tokenizer class is used to tokenize the expressions and make it into separate tokens. Each token is pushed to two different stacks named operator and operands. Operator and Operand class are used to check the type of the tokens. Operator class is an abstract class which gives abstract methods. HashMap is created in operator which is excessed in evaluator to map the expression using the delimiters given. Evaluator class has the skeleton of the whole algorithm which reads all the tokens and using while loop it divides them into operator and operand. If the token is operand it pushes it to operand stack. The checks of operator token are done using another while loop where it checks for the priority of the operators and does the execution depending on it.
# Summary of Work Completed
For this project, firstly I worked on the operator class where I created a static HashMap which is used in the evaluator class to map operator string and Operator object to it. Since the operator class is an abstract class, I created subclasses for each operator that will be used to map the tokens and give values. I created seven different subclasses of each operator and each of those class it does its calculation. In operator class, I also made some Boolean check for the string which is used to check the tokens and make sure if it is in the delimiters. I added few things in the operand class. The operand class gets the value as a string where it changes it to integer using parse Int. In evaluator class, I implemented the algorithm for the Operator Stack. First, I added a check for the token to be close parenthesis and if the token is close parenthesis, then I solved the expression inside the brackets until it reaches the open parenthesis. After open parenthesis is found, it will exit the loop and pop out the operator from the stack. If the token is not close parenthesis and the operator stack have more operators and if the operator on the top of the stack has higher precedence then the token in the new operator, and if the token also does not equals open parenthesis, then it goes inside the loop and perform execution of top two values of the operand stack popping the top of the operator stack. After all the tokens are read and pushed into their stacks, it checks it there are any token remaining in the stack and if there is it pops out both the operand and the operator and does the execution of the expression. At last, the final value of the execution is pushed into the operand stack and finally the operand stack is popped for the result and gives the return value.
# 2 Development Environment
I used JAVA version 11 to do my project and used InteliJ IDEA.
# 3 How to Build/Import your Project
The first step I did was open the GitHub and downloaded the zip file. Then, I went to my IntelliJ and did open project and open the downloaded file and went through each step.
# 4 How to Run your Project
The first way is to locate and click the small green button at the top of the window. Another way to run your program is to click on the "Run" tab at the top of the window and then select run configurations.
# 5 Assumption Made
The skeleton of the project was provided, so I thought I needed to create HashMap in operator and also the sub classes. As I was working on the sub classes, I was supposed to write the priority of each operator. It was given in the pdf that the priorities of add/sub as 1, multiply/divide as 2 and power as 3 so, I assumed that 1 was the highest priority but as I was working through my code I figured it out that it’s the opposite way and the code follows the PEMDAS rule. I also assumed that the parenthesis would have two different priority for each closed parenthesis and open parenthesis but later I figured out the way to do it using different method.
# 6 Implementation Discussion
The evaluator class has two stacks for operator and operand and then string tokenizer library is used to divide the and get the expression into tokens. Each token is check if it is operator or operand and it is pushed into their stacks. The interfaces in the operator and operand class checks if the token is operand or operator. After recognizing that the token is operand, the operand class get the tokens and it pushes the token into its stack. And if the token is operator then static check type is class and the operator class initialize the operator depending on its type.
# 7 Project Reflection
While starting the project, I was struggling and couldn’t figure out what I needed to do. So, I collaborated with one of my classmates, Roshni Varghese. We started from evaluator. We went through each line of code it was given there. We started writing that down in the paper and figured out how it was working. Once we both got how to the programs run. We started typing the code on our own. First, I wrote a code that just worked on the with the simple expression without the parenthesis. Then, When I started to implement the code for parenthesis. I struggled a lot. It took me long time to figure out how to work with the parenthesis.
# 8 Project Conclusion/Results
I was successfully able to pass all the test cases that was given in the evaluation driver, and also I tried some of my own expressions that I created, and it worked successfully. The most challenging part for me was to figure out how to add the parenthesis as initially my algorithm only evaluating one parenthesis
