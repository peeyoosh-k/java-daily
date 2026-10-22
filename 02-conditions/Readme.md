# 02-conditions

Practice questions for conditions. Each program is in its own file, and the file name matches the class name. Questions are grouped by concept, so finish every group before moving to the next topic.

## if and if-else

| # | Class | Question |
|---|-------|----------|
| 1 | `EvenOdd` | Read a number and print whether it is even or odd. |
| 2 | `PositiveNegativeZero` | Read a number and print whether it is positive, negative, or zero. |
| 3 | `VotingEligibility` | Read an age and print whether the person can vote (18 or above). |
| 4 | `LargestOfTwo` | Read two numbers and print the larger one. |

## else-if ladder

| # | Class | Question |
|---|-------|----------|
| 5 | `GradeCalculator` | Read marks (0 to 100) and print the grade: A (90+), B (75+), C (50+), otherwise F. |
| 6 | `LargestOfThree` | Read three numbers and print the largest one. |
| 7 | `TriangleType` | Read three sides and print whether the triangle is equilateral, isosceles, or scalene. |
| 8 | `ElectricityBill` | Calculate a bill by slab: the first 100 units at one rate, the next 100 at another, and above 200 at a third. |

## Logical operators

| # | Class | Question |
|---|-------|----------|
| 9 | `LeapYear` | Read a year and print whether it is a leap year. |
| 10 | `VowelOrConsonant` | Read a `char` and print whether it is a vowel or a consonant. |
| 11 | `CharacterType` | Read a `char` and print whether it is uppercase, lowercase, a digit, or a special character. |

## Nested if

| # | Class | Question |
|---|-------|----------|
| 12 | `LoginCheck` | Read a username and a password and check both. Use `.equals()` for the comparison. |
| 13 | `AtmWithdrawal` | Allow a withdrawal only if the amount is a multiple of 100 and not more than the balance. |

## String comparison

| # | Class | Question |
|---|-------|----------|
| 14 | `StringCompare` | Compare two strings with `==` and with `.equals()`. Predict the results first, then explain the difference. |

## Ternary operator

| # | Class | Question |
|---|-------|----------|
| 15 | `MinMaxTernary` | Rewrite `LargestOfTwo` using the `? :` operator. |

## switch (classic)

| # | Class | Question |
|---|-------|----------|
| 16 | `DayOfWeek` | Read a number from 1 to 7 and print the day name, with a `default` case. |
| 17 | `CalculatorSwitch` | Read two numbers and an operator (`+ - * /`) and calculate using `switch`. Include the divide-by-zero check. |
| 18 | `MonthDays` | Read a month number and print how many days it has. Group months using fall-through. |

## switch (modern)

| # | Class | Question |
|---|-------|----------|
| 19 | `DayOfWeekArrow` | Rewrite `DayOfWeek` using the `->` syntax. |

## Fixing earlier programs

| # | Class | Question |
|---|-------|----------|
| 20 | `ValidCircle` | Rewrite `AreaOfCircle` so a negative radius prints an error message instead of an area. |

## Concepts to be able to explain

- The difference between `=` and `==`
- Why `if (x = 5)` does not compile in Java
- How `&&` and `||` short-circuit
- Why `==` is wrong for comparing Strings
- What happens if you forget `break` in a `switch`
- When a ternary is better than if-else, and when it is not
- How `else if` differs from separate `if` statements