![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

![img_3.png](img_3.png)

![img_4.png](img_4.png)

** When we do not know in future which elements will come we can take stack in that case

** so In stack we will push as soon as * will come we will pop

![img_5.png](img_5.png)

** StringBuilder also we can use as a STACK bcz there will be a method 

** Unlike String String Builder is a Mutable so we can use it
//TC and SC - O(n) bcz we are pushing in sb and based on starts we are popping

2nd Way
========

we can take 2 pointer i and j
i and j will point to the 1st character
j will be the main pointer for traversal
whenever j will see non-star then will put into character array and character i and j will move forward
and whenever j will see star character the move backward i with one step back word direction.

![img_6.png](img_6.png)