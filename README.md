# ObjectSizeCalculator
In Java 8 (till Java 11) there is a nice method _'getObjectSize'_ in _'jdk.nashorn.internal.ir.debug.ObjectSizeCalculator'_ class.<br>
<br>
Here is an example, showing how to get exact byte size of a single Integer in any JCF class.

# Summary for x64 system:
(a single +1 Integer element costs):

# List
Vector, Stack, ArrayList: 16 byte<br>
LinkedList: 40 byte<br>

# Queue
ArrayDeque, PriorityQueue: 16 byte<br>
 
# Set
HashSet: 48 byte<br>
LinkedHashSet, TreeSet: 56 byte<br>

# Map
HashMap: 48 byte<br>
LinkedHashMap: 56 byte<br>
