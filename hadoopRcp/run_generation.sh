/usr/local/hadoop/bin/hadoop jar generation.jar $1 $2
echo 'Job Input'
echo '----------'
echo ''
echo ''
echo 'Job Output'
echo '----------'
#cat hdfs://192.168.200.129:9000/user/hadoopuser/output/part-r-0000
/usr/local/hadoop/bin/hadoop dfs -cat inputMatrice/matriceR
