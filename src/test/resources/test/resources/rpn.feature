Feature: Calculator
Scenario Outline: Calculator Functions
Given user enters <expression>
Then system shows <Result>
Examples:
| expression | Result |
| "1 2 3 + - " | "-4.0" |
| "6 2 * 3 /" | "4.0" |
| "2 3 ^ 4 5 + + " | "17.0" |
| "3 ! 4 5 * + " | "26.0" |
| "12 3 / !" | "24.0" |
| "5 1 2 + 4 * + 3 -" | "14.0" |
 