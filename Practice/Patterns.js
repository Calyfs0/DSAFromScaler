function divider()
{
    console.log('---------------------------------------------------')
}

l = 10
b = 5

//Solid Rectangle
for(i=0;i<b;i++){
    output = "*"
    for(j=1;j<l;j++){
        output += ' *'
    }
    console.log(output)
}

//Hollow rectangle
for(i=0;i<b;i++){
    output = '*'
    for(j=1;j<l;j++){
        if(i==0 || i==b-1 || j==l-1){
            output = output + ' *'
        }
        else output += '  '
    }
    console.log(output)
}
