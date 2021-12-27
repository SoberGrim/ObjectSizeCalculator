# ObjectSizeCalculator
In Java 8 (till Java 11) there is a nice method 'ObjectSizeCalculator.getObjectSize' in "import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;"
<br>
Here is an example, showing how to get exact byte size of a single Integer in any JCF class.

Summary for x64 system:
(a single +1 Integer element costs):

#Lists
Vector, Stack, ArrayList: 16 byte
LinkedList: 40 byte

#Queues
ArrayDeque, PriorityQueue: 16 byte,
 
#Sets
HashSet: 48 byte,
LinkedHashSet, TreeSet: 56 byte

#Maps
HashMap 48 byte,
LinkedHashMap 56 byte
