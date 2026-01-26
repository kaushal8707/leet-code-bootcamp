![img.png](img.png)

 # Array Advantage:

   1. Random Access 
            we can access using index randomly
   2. Cache Friendly
            neighbouring elements will store in a cache.
            while fetch arr[7]=99 and while trying to fetch arr[5] it will fetch from cache not from main memory
            the reason is it will store neighbouring elements in a cache so searching and accessing ll be fast.

![img_1.png](img_1.png)


 # Array Disadvantage:

   1. Fixed Size
        we give the size of an array during declaration.
        to add any additional element we have to declare new array and then copy the elements and then insert the elements.
        ![img_2.png](img_2.png)

   2. To resolve this issue we can use inbuilt data structure like ArrayList or LinkedList.

# Time Complexity:

![img_3.png](img_3.png)

# Linear Search

   - Linear search will apply on an unsorted array or a random elements in an array.
   - Time Complexity: O(n)  / Big O(n)

![img_4.png](img_4.png)

# Binary Search

   - Binary Search will apply on a monotonic data structure.
   - Monotonic means either in ascending order or a descending order.
   - Binary Search will apply on a sorted array.
   - ![img_5.png](img_5.png)
   - ![img_6.png](img_6.png)
   - Time Complexity: O(log(n))



