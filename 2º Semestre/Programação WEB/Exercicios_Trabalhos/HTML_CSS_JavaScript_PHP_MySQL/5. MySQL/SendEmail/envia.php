<?php
 // Adiciona o arquivo class.phpmailer.php - voc� deve especificar corretamente o caminho da pasta com o este arquivo.
 require_once("phpmailer/PHPMailerAutoload.php");
 // Inicia a classe PHPMailer
 $mail = new PHPMailer();
 // DEFINI��O DOS DADOS DE AUTENTICA��O - Voc� deve auterar conforme o seu dom�nio!
 $mail->IsSMTP(); // Define que a mensagem ser� SMTP
 $mail->Host = "smtp.seudominio.com.br"; // Seu endere�o de host SMTP
 $mail->SMTPAuth = true; // Define que ser� utilizada a autentica��o -  Mantenha o valor "true"
 $mail->Port = 587; // Porta de comunica��o SMTP - Mantenha o valor "587"
 $mail->SMTPSecure = false; // Define se � utilizado SSL/TLS - Mantenha o valor "false"
 $mail->SMTPAutoTLS = false; // Define se, por padr�o, ser� utilizado TLS - Mantenha o valor "false"
 $mail->Username = 'conta-de-email@seudominio.com.br'; // Conta de email existente e ativa em seu dom�nio
 $mail->Password = ''; // Senha da sua conta de email
 // DADOS DO REMETENTE
 $mail->Sender = "conta-de-email@seudominio.com.br"; // Conta de email existente e ativa em seu dom�nio
 $mail->From = "conta-de-email@seudominio.com.br"; // Sua conta de email que ser� remetente da mensagem
 $mail->FromName = "Form do site"; // Nome da conta de email
 // DADOS DO DESTINAT�RIO
 $mail->AddAddress($_POST['email'], 'Nome - Recebe1'); // Define qual conta de email receber� a mensagem
 //$mail->AddAddress('recebe2@dominio.com.br'); // Define qual conta de email receber� a mensagem
 //$mail->AddCC('copia@dominio.net'); // Define qual conta de email receber� uma c�pia
 //$mail->AddBCC('copiaoculta@dominio.info'); // Define qual conta de email receber� uma c�pia oculta
 // Defini��o de HTML/codifica��o
 $mail->IsHTML(true); // Define que o e-mail ser� enviado como HTML
 $mail->CharSet = 'utf-8'; // Charset da mensagem (opcional)
 // DEFINI��O DA MENSAGEM
 $mail->Subject  = "Formul�rio de Contato"; // Assunto da mensagem
 $mail->Body .= " Nome: ".$_POST['nome']."<br />"; // Texto da mensagem
 $mail->Body .= " E-mail: ".$_POST['email']."<br />"; // Texto da mensagem
 $mail->Body .= " Assunto: ".$_POST['assunto']."<br />"; // Texto da mensagem
 $mail->Body .= " Mensagem: ".nl2br($_POST['mensagem'])."<br />"; // Texto da mensagem
 // ENVIO DO EMAIL
 $enviado = $mail->Send();
 // Limpa os destinat�rios e os anexos
 $mail->ClearAllRecipients();
 // Exibe uma mensagem de resultado do envio (sucesso/erro)
 if ($enviado) {
   echo "E-mail enviado com sucesso!";
 } else {
   echo "N�o foi poss�vel enviar o e-mail.";
   echo "Detalhes do erro: " . $mail->ErrorInfo;
 }
