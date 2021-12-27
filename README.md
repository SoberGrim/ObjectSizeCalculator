# ObjectSizeCalculator
In Java 8 (until Java 11) there is a method _'getObjectSize'_ in _'jdk.nashorn.internal.ir.debug.ObjectSizeCalculator'_ class.<br>
This method lets us measure any Object size, containing any other elements or Objects inside it (that's called deep Object size)<br>
<br>
_'getObjectSize'_ was added in Java 8 as a part of 'Nashorn JavaScript engine' and depricated in Java 11.<br>
<br>
Here is an example, showing how to get exact byte size of a single Integer in any JCF class (or a deep size of any other object in Java)

# Summary for x64 system:
(a single +1 Integer element costs):

# List
Vector, Stack, ArrayList: 16 byte<br>
_(one link 8 byte + one Integer 8 byte)_<br>
<br>
LinkedList: 40 byte<br>
_(node 8 byte, prev\next\current link 8 byte each, Integer 8 byte)_<br>
<br>
# Queue
ArrayDeque, PriorityQueue: 16 byte<br>
_(one link 8 byte + one Integer 8 byte)_<br>
<br>
# Set
HashSet: 48 byte<br>
_(node 8 byte, key\value links 8 byte each, key\value Integers 8 byte each, next element in bucket link 8 byte)_<br>

LinkedHashSet: 56 byte<br>
_(HashSet size + one link 8 byte)_

TreeSet: 56 byte<br>
_(node 8 byte, key\value links 8 byte each, key\value Integers 8 byte each, two child elements 8 byte each)_<br>
<br>

# Map
HashMap: 48 byte<br>
_(same as HashSet)_<br>
<br>
LinkedHashMap: 56 byte<br>
_(same as HashMap)_<br>
<br>
TreeMap: 56 byte<br>
_(same as TreeSet)_<br>
