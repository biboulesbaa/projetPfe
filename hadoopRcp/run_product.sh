/usr/local/hadoop/bin/hadoop dfs -rmr outputMatrice
#hadoop jar calcul.jar inputMatrice/ outputMatrice/  5 40 40 M A MA
/usr/local/hadoop/bin/hadoop jar calcul.jar $1 $2 $3 $4 $5 $6 $7 $8
echo 'Job Input'
echo '----------'
echo ''
echo ''
echo 'Job Output'
echo '----------'
#cat hdfs://192.168.200.129:9000/user/hadoopuser/output/part-r-00000
/usr/local/hadoop/bin/hadoop dfs -cat outputMatrice/part-r-00000
