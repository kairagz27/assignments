# Assignment 1: Recursion (ADS)

**Student:** Kairbek Agzam
**Group:** SE25-13

## Work Process Summary
В этом задании я реализовал 10 задач с использованием рекурсии на языке Java. Основное требование — полный отказ от циклов `for` и `while` — было соблюдено во всех методах. Я проработал базовые случаи и рекурсивные шаги для каждой задачи, обеспечив корректную обработку входных данных и работу со стеком вызовов.

---

## Part 1. Recursion with Numbers

### Task 1: Print Digits of a Number
**Description:** Write a recursive function that takes an integer as input and prints every digit on a separate line.
**Solution Explanation:** The function uses `n / 10` to go deep into recursion until the first digit, then prints `n % 10` as it returns, ensuring digits appear in the correct order.
**Screenshot:**
<img width="1913" height="1079" alt="image" src="https://github.com/user-attachments/assets/b4a9bde4-56a8-4aa2-958d-ceed137dee19" />

### Task 2: Average of Elements
**Description:** Write a recursive function to calculate the sum of the elements, then compute the average using the result.
**Solution Explanation:** I implemented a `findSum` helper method that recursively adds the last element to the sum of the remaining elements. The final result is divided by $n$ to get the average.
**Screenshot:**
<img width="1917" height="1079" alt="image" src="https://github.com/user-attachments/assets/b6d655a7-8e60-4a4f-85d3-d4b9b2824c54" />

### Task 3: Prime Number Check
**Description:** Write a recursive function that checks whether a number $n$ is prime.
**Solution Explanation:** The function checks divisibility starting from $i=2$. If $n$ is divisible by any $i$ where $i^2 \le n$, it returns "Composite". If no divisors are found, it returns "Prime".
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/7f30217e-5dfc-41aa-ab7b-4e04257670bf" />

### Task 4: Factorial
**Description:** Write a recursive function that calculates $n!$ (factorial).
**Example Input:** 5 **Example Output:** 120
**Solution Explanation:** The base case is $n \le 1$ returning 1. The recursive step multiplies $n$ by the factorial of $n-1$.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ec99938e-0cd3-4fd4-b299-a25845d9c3f4" />

---

## Part 2. Recursion with Sequences

### Task 5: Fibonacci Number
**Description:** Write a recursive function to find the n-th Fibonacci number.
**Example Input:** 5 **Example Output:** 5
**Solution Explanation:** Implemented using the formula $F_n = F_{n-1} + F_{n-2}$ with two base cases: $F_0 = 0$ and $F_1 = 1$.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/103530bb-d39d-4c95-9b66-d9a443b89ca3" />

### Task 6: Power Function
**Description:** Write a recursive function that returns $a^n$.
**Example Input:** 2 and 10 **Example Output:** 1024
**Solution Explanation:** The function repeatedly multiplies the base $a$ by itself, decrementing the exponent $n$ until it reaches 0 (base case).
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5bbe4f21-da24-4d57-ae1d-84787e42a74b" />

### Task 7: Reverse Output
**Description:** Write a recursive function that reads $n$ numbers and prints them in reverse order without using an array.
**Solution Explanation:** By placing the `System.out.print` statement **after** the recursive call, the numbers are stored in the call stack and printed only as the recursion unwinds.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/a404ef52-2a56-46d0-aac2-368d0df1d86a" />

---

## Part 3. Recursion with Strings and GCD

### Task 8: Check Digits in String
**Description:** Check if a string consists only of digits.
**Solution Explanation:** The function checks the first character using `Character.isDigit()`. If true, it recursively checks the substring starting from the next character.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0f588132-56c7-4fc6-870b-067d35f15bc9" />

### Task 9: Count Characters
**Description:** Count the number of characters in a string.
**Solution Explanation:** Every recursive step adds 1 to the result and calls the function with the string minus its first character. The base case is an empty string returning 0.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/bbdc3bea-d11d-412e-9330-a1e161dd86e2" />

### Task 10: Greatest Common Divisor (GCD)
**Description:** Find the GCD of two numbers using the Euclidean Algorithm.
**Solution Explanation:** The function applies $GCD(a, b) = GCD(b, a \pmod b)$ until the divisor $b$ becomes 0, leaving $a$ as the greatest common divisor.
**Screenshot:**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0898e245-3419-4e3f-9984-af81055589c4" />
