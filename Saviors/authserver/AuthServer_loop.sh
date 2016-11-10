#!/bin/bash

while :;
do
	java -server -Dfile.encoding=UTF-8 -Xmx64m -cp config:./../libs/* zgts.authserver.AuthServer > log/stdout.log 2>&1

	[ $? -ne 2 ] && break
	sleep 10;
done
