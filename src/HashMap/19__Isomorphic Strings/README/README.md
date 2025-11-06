![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

![img_3.png](img_3.png)

It should have one to one Mapping.

![img_4.png](img_4.png)

![img_5.png](img_5.png)

# Exceptional case But, In case s = "abcd" and t = "abab" will return true but it should be false

![img_6.png](img_6.png)

earlier above one was giving true

# Space Complexity

Space complexity will be O(n) not even Big (n) so How many ascii character consists that much length
so How many valid ascii characters that much lengths will happen

# Time Complexity
 we are using containsKey() and get() will happen in O(1)

 
# Second Approach [ Count Array ]

 since we are having a limited no. of characters so we can use count array

 In our ASCII table total no. of character will be 256

 filled default with -1 because -1 is not any ascii value of any character

 ![img_7.png](img_7.png)
 
Time complexity O(n) because how much length string
Space complexity O(1)
