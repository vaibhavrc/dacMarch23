Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM    
$ git init
Initialized empty Git repository in C:/Users/Vaibhav/Documents/CDAC/SDM/.git/

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ git status
On branch master

No commits yet  

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Demo.html
        Demo1.html

nothing added to commit but untracked files present (use "git add" to track)

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ git add .

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Demo.html
        new file:   Demo1.html


Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$git commit -m "First commit for project"
[master (root-commit) 66f6054] First commit for project
 2 files changed, 25 insertions(+)
 create mode 100644 Demo.html
 create mode 100644 Demo1.html

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$git config --global user.name "Vaibhav"

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ git config --global user.email "chavan.vaibhav27@gmail.com"

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$git config --global --edit

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$git remote add origin "https://github.com/vaibhavrc/dacMarch23.git"

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ push -u origin main
bash: push: command not found

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$ git push -u origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/vaibhavrc/dacMarch23.git'

Vaibhav@DESKTOP-QLH7V9S MINGW64 ~/Documents/CDAC/SDM (master)
$