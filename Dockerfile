FROM  cyberdojofoundation/java
LABEL maintainer=jon@jaggersoft.com

COPY /jars/* /mockito/
ENV CLASSPATH=/mockito/

COPY red_amber_green.rb /usr/local/bin

