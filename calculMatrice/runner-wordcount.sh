hadoop dfs -rmr outputMatrice
hadoop jar build/jar/calcul.jar inputMatrice/ outputMatrice/  5 40 40 A M AM
echo 'Job Input'
echo '----------'
echo ''
echo ''
echo 'Job Output'
echo '----------'
#cat hdfs://192.168.200.129:9000/user/hadoopuser/output/part-r-00000
hadoop dfs -cat outputMatrice/part-r-00000
