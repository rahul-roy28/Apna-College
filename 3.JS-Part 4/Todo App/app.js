let todo=[];

let input=prompt('Enter your choice:');

while(true){
    if (input=='quite'){
        console.log('Quiting todo');
        break;
    }
    if(input=='list'){
        console.log('.............')
        for(i=0;i<todo.length;i++){
            console.log(i,todo[i]);
        }
        console.log('.............')
    }else if(input=='add'){
        let task=prompt('Add a task :');
        todo.push(task);
        console.log('Task Added')
    }else if(input=='delete'){
        let del=prompt('Enter list noumber, which you want to delete:');
        todo.splice(del,1);
    }else{
        console.log('Invalid request')
    }
    input=prompt('Enter your choice:');

}