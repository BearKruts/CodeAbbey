<?php
	/**
	*    Problem: Dynamic Web Page
	*    URL: http://www.codeabbey.com/index/task_view/dynamic-web-page
	*    Autor: Mykhailo Kruts
	*    Date: 21 March 2018
	*/

	$random = rand(10000, 99999999);
	$solt = 1366;

	while ($random % $solt != 0) {
		$random = rand(10000, 99999999);
	}

	echo "Random value is $random";
?>