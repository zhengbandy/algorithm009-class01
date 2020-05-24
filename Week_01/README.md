学习笔记

Queue 是一个Interface
方法： 

add（e）：如果容量够并且添加成功的话，可以将指定元素e添加到队列中，并且返回true。
如果容量不够导致不能添加元素，会抛出IllegalStateException异常
如果添加的元素的类型不匹配，会抛出ClassCastException异常
由于Queue无法添加null，所以添加null时，会抛出NullPointerException异常 
IllegalArgumentException - if some property of this element prevents it from being added to this queue

offer(e)：如果容量够并且添加成功的话，可以将指定元素e添加到队列中，并且返回true。如果因为容量限制添加失败返回false。
如果添加的元素的类型不匹配，会抛出ClassCastException异常
由于Queue无法添加null，所以添加null时，会抛出NullPointerException异常 
IllegalArgumentException - if some property of this element prevents it from being added to this queue

remove()：检索并删除此队列的头。如果Queue为空，会抛出 NoSuchElementException 异常。

poll()：检索并删除此队列的头部。如果Queue为空，会返回null。

peek()：检索但不删除此队列的头。如果Queue为空，会返回null。

element()：检索但不删除此队列的头。如果Queue为空，会抛出 NoSuchElementException 异常。

PriorityQueue 是一个Class 继承了 AbstractQueue 
PriorityQueue以数组存储，默认初始化长度为11
构造函数 
PriorityQueue()
按照默认长度11创建队列，并按照自然顺序进行排序。 

PriorityQueue(Collection<? extends E> c)
创建队列，并包含集合c中的元素。

PriorityQueue(Comparator<? super E> comparator)
按照默认长度11创建队列，并加入排序比较器。

PriorityQueue(int initialCapacity)
指定初始化长度创建队列，并按照自然顺序进行排序。

PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
指定初始化长度创建队列，并加入排序比较器。

PriorityQueue(PriorityQueue<? extends E> c)
PriorityQueue在指定的优先级队列中创建一个包含元素的。

PriorityQueue(SortedSet<? extends E> c)
创建一个PriorityQueue包含指定排序集中的元素的。

方法： 
add(E e)
将指定的元素插入此优先级队列。

clear()
从此优先级队列中删除所有元素。

comparator()
返回用于对此队列中的元素进行排序的比较器，如果为自然排序，则返回null。

contains(Object o)
此队列是否包含指定的元素，若存在，则返回true。

offer(E e)
将指定的元素插入此优先级队列。

peek()
检索但不删除此队列的头，如果此队列为空，则返回null。

poll()
检索并删除此队列的头部，如果此队列为空，则返回null。

remove(Object o)
从该队列中删除指定元素的单个实例（如果存在），并返回true。

size()
返回此队列中的元素数。

toArray()
返回一个包含此队列中所有元素的数组。

toArray(T[] a)
返回一个包含此队列中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。