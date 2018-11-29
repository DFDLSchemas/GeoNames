# GeoNames

GeoNames is a big, useful data set found at www.geonames.org.

The file is quite large. Many gigabytes when uncompressed.

It's not an easy-to-use format, and the single giant file is
problematic.

This module is a DFDL schema that parses this data, and that can create
a rational XML representation. 

It is an interesting schema because it is intentionally trying to parse one
format, but unparse to another. The unparsed output is text, that happens to be
well-formed textual XML. 

This schema requires a 2.3.0 version of Daffodil. It was created before 
release of 2.3.0, using a development snapshot. 

Remaining work to be done: A little ETL application needs to be built that 
drives daffodil to parse the data record by record (using new message-streaming 
API), aggregate 1000 at a time (say), and unparse into XML output data files 
(many of them). If we want to group or sort the data by say, parentFeature 
resource URI, then an Apache Spark job may be ideal for this ETL work. 
 
A code examples of daffodil with Apache Spark is at:

https://github.com/OpenDFDL/daffodil-spark