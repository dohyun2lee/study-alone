#!/bin/bash
cd /cache1/psync

m0=$1
[ a$m0 == a ] && echo $0 20220714 1100 20220714 1200 && exit

time0=$(date -d "$1 $2" +%s) # get unix time
time=$(date -d "$3 $4" +%s) # get unix time

bool=false
bool2=false

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
#./5m_sql.sh $w
#./dg_5m_sql.sh $w
#./v2_sync_up_5m.sh $w


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



if [[ $bool == "false" ]]; then 
if [[ `expr $i % 300` != 0 ]]; then
if [[ $i == $time ]]; then
for (( j=$time; j<=$time + 300; j+=60 ))
do
b=$(date +'%Y%m%d%H%M' --date @$j)

if [[ `expr $j % 300` == 0 ]]; then
echo ./5m_sql.sh $b
echo ./dg_5m_sql.sh $b
echo ./v2_sync_up_5m.sh $b
fi
done
bool=true
fi
fi
fi


if [[ $bool2 == "false" ]]; then
if [[ `expr $i % 3600` != 0 ]]; then
if [[ $i == $time ]]; then
for (( k=$time; k<=$time + 3600; k+=60 ))
do
c=$(date +'%Y%m%d%H%M' --date @$k)

if [[ `expr $k % 3600` == 0 ]]; then
echo ./1h_sql.sh $c
echo ./dg_1h_sql.sh $c
echo ./v2_sync_up_1h.sh $c
fi
done
bool2=true
fi
fi
fi


done
