
# When ever any array kind of problem come just see can we solve using 2 Pointer approach

![img.png](img.png)

input - [-4, -1, 0, 3, 10]
output - [0, 1, 9, 16, 100]

** in first scenario we are squaring each element and then sorting
  
![img_1.png](img_1.png)

Time Complexity - O(n log(n))   - bcz tracing and sorting



** 2nd approach**

![img_2.png](img_2.png)

the array is in sorted order so -ve and +ve value will come

we can see bigger value if we neglect -ve sign the bigger value are at extreme how we will go in middle modulus value will be small
so here pattern is bigger value will be at end position so we can apply 2 pointer approach here

so in start will be pointer l and at end pointer will be r, then we will check in l and r which value is greater than
![img_3.png](img_3.png)

so we will take a new array,  since we have to sort in ascending order since bigger value will be at end so our pointer for a new array start from end
in case if resultant array we want in a descending order so in a new array our loop will start from zeroth index

we will check modules from l and r 
suppose mod(arr[l]) > mod(arr[r]) -> so lth element will store at end in a new array and increase l++
suppose mod(arr[l]) < mod(arr[r]) -> so rth element will store at end in a new array and decrease r--

![img_4.png](img_4.png)

![img_5.png](img_5.png)

Time complexity - O(n)
Space complexity - constant bcz we have not taken any extra spaces.

*** Two Pointer Approach we can use in a multiple way

- some time both pointers starts from starting position
- sometime one from start and another from end position
- sometime one is moving fast and another is moving slow
- When ever any array kind of problem come just see can we solve using 2 Pointer approach
- 
