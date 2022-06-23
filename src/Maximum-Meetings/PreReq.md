To sort the user-defined objects, use _Comparator Interface_<br>

This interface is present in java.util package and contains 2 methods compare(Object obj1, Object obj2) and equals(Object element). Using a comparator, we can sort the elements based on data members. For instance, it may be on roll no, name, age, or anything else.<br>

## Working of sort() method

Internally the Sort method does call Compare method of the classes it is sorting. <br>
**To compare two elements, it asks “Which is greater?”**
Compare method returns -1 if first obj is less than second obj<br>
Compare method returns 0 if first obj is equal to second obj<br>
Compare method returns +1 if first obj is greater than second obj<br>
