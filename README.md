# GeoNames

GeoNames is a big and useful data set found at www.geonames.org.

The file is quite large. Many gigabytes when uncompressed.

It's not an easy-to-use format, and the single giant file is
problematic. The format contains a quasi-XML fragment of data in each
record of data. This can't be parsed with an XML parser unless it is first
parsed and then reassembled into viable XML. 

This module is a DFDL schema that parses this data, and that enables one to
reconstruct a "real XML" representation.

This schema is portable to both IBM DFDL, and Daffodil. 

Note that if you parse, then unparse this data, you'll get out again the exact
same format you started from. You don't want to unparse this. You want to write
out something different. 

A suggested approach: one should parse this data record by record, and bunch up 
into files of maybe 10,000 records, and make "real XML" documents of each of them, 
thereby converting this data from a single giant file of quasi-XML things into
a large collection of smaller "true XML" files. The files could still be compressed
individually to make the whole set smaller. 




