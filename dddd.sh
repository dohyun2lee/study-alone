#!/bin/bash
cd /cache1/psync

m0=$1
[ a$m0 == a ] && echo $0 20220714 1100 20220714 1200 && exit

time0=$(date -d "$1 $2" +%s) # get unix time
time=$(date -d "$3 $4" +%s) # get unix time

for (( i=$time0; i<=$time; i+=60 ))
do
a=$(date +'%Y%m%d%H%M' --date @$i)

#if [ $do1h == 0 ]; then
# ./Update_domain_group.sh
#fi

#do 1m
echo ./sync_1m.sh $a
echo ./dg_1m_sql.sh $a
echo ./v2_sync_up_1m.sh $a

#./sync_1m.sh $w
#./dg_1m_sql.sh $w
#./v2_sync_up_1m.sh $w

#do 5m
if [[ `expr $i % 300` == 0 ]]; then
echo ./5m_sql.sh $a
echo ./dg_5m_sql.sh $a
echo ./v2_sync_up_5m.sh $a
fi
# ./5m_sql.sh $w
# ./dg_5m_sql.sh $w
# ./v2_sync_up_5m.sh $w


#do 1h
if [[ `expr $i % 3600` == 0 ]]; then
echo ./1h_sql.sh $a
echo ./dg_1h_sql.sh $a
echo ./v2_sync_up_1h.sh $a
fi
#./1h_sql.sh $w
#./dg_1h_sql.sh $w
#./v2_sync_up_1h.sh $w


#do 1d
if [[ `expr $i % 86400` == 0 ]]; then
echo ./1d_sql.sh $a
echo ./dg_1d_sql.sh $a
echo ./v2_sync_up_1d.sh $a
fi

#./1d_sql.sh $w
#./dg_1d_sql.sh $w
#./v2_sync_up_1d.sh $w

done
