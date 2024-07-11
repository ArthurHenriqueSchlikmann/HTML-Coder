#!/bin/bash
usuario=$(whoami)
if [ "$usuario" != "root" ];
then
	echo "Voce precisa de root!"
else
	apt install openjdk-11-jdk
	apt install maven
	echo -e "#!/bin/bash\nmvn javafx:run" | tee run.sh
	chmod 777 run.sh
fi
