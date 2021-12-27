# ObjectSizeCalculator
In Java 8 (until Java 11) there is a nice method _'getObjectSize'_ in _'jdk.nashorn.internal.ir.debug.ObjectSizeCalculator'_ class.<br>
(part of the Nashorn JavaScript engine, added in Java 8 and depricated in Java 11)<br>
<br>
Here is an example, showing how to get exact byte size of a single Integer in any JCF class (or a deep size of any other object in Java)

# Summary for x64 system:
(a single +1 Integer element costs):

# List
Vector, Stack, ArrayList: 16 byte<br>
(one link 8 byte + one Integer 8 byte)<br>
<br>
LinkedList: 40 byte<br>
(node 8 byte, prev\next\current link 8 byte each, Integer 8 byte)<br>
<br>
# Queue
ArrayDeque, PriorityQueue: 16 byte<br>
(one link 8 byte + one Integer 8 byte)<br>
<br>
# Set
HashSet: 48 byte<br>
(node 8 byte, key\value links 8 byte each, key\value Integers 8 byte each, next element in bucket link 8 byte)<br>

LinkedHashSet: 56 byte<br>
(HashSet size + one link 8 byte)

TreeSet: 56 byte<br>
(node 8 byte, key\value links 8 byte each, key\value Integers 8 byte each, two child elements 8 byte each)<br>
<br>

# Map
HashMap: 48 byte<br>
(same as HashSet)<br>
<br>
LinkedHashMap: 56 byte<br>
(same as HashMap)<br>
