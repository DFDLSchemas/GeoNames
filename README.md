# GeoNames

GeoNames is a big and useful data set found at www.geonames.org.

The file is quite large. Many gigabytes when uncompressed.

It's not an easy-to-use format, unless you have a specific data import program that 
already knows about this format. The single giant file is also quite
problematic. The format contains a quasi-XML fragment of data in each
record of data. This can't be parsed with an XML parser unless it is first
parsed and then reassembled into viable XML. 

Note that this DFDL schema is not really a practical way to process this kind of data.
There are RDF-style importers that handle this sort of data directly. Nevertheless this
example illustrates the kind of thing DFDL can do easily to convert data from some
ad-hoc file format into XML or JSON. 

This module is a DFDL schema that parses this data, and that enables one to
reconstruct a "real XML" representation.

This schema is portable to both IBM DFDL, and Daffodil. 

Note that if you parse, then unparse this data, you'll get out again the exact
same format you started from. You don't want to unparse this. You want to write
out something different. 

See https://github.com/OpenDFDL/daffodil-spark for code that actually converts geonames
data into XML files. It shows how to use apache spark to operate on the data after parsing it
with daffodil. The assembly into XML, and creation of a multi-file compressed-XML dataset
is all parallelized by spark.





